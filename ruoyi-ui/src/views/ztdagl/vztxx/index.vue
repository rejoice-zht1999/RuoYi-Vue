<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="100px">
      <el-form-item label="社会信用代码" prop="uniscid">
        <el-input
          v-model="queryParams.uniscid"
          placeholder="请输入社会信用代码"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="药店名称" prop="entname">
        <el-input
          v-model="queryParams.entname"
          placeholder="请输入药店名称"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-table v-loading="loading" :data="vztxxList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center"/>
      <el-table-column label="药店名称" align="center" prop="entname"/>
      <el-table-column label="社会信用代码" align="center" prop="uniscid" width="180"/>
      <el-table-column label="负责人" align="center" prop="llr" width="80"/>
      <el-table-column label="监管单位" align="center" prop="jgorgName" width="180"/>
      <el-table-column label="监管所" align="center" prop="jgsName" width="120"/>
      <el-table-column label="成立日期" align="center" prop="estdate" width="100">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.estdate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

  </div>
</template>

<script>
import {listVztxx} from "@/api/ztdagl/vztxx";

export default {
  name: "Vztxx",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 主体信息表格数据
      vztxxList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        uniscid: null,
        entname: null,
      },
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询主体信息列表 */
    getList() {
      this.loading = true;
      listVztxx(this.queryParams).then(response => {
        this.vztxxList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.recid)
      this.single = selection.length !== 1
      this.multiple = !selection.length
    },
  }
};
</script>
<style scoped>
.qrcode /deep/ .el-dialog__body {
  padding: 15px 30px;
}

.bm-view {
  width: 100%;
  height: 400px;
}

/deep/ .elTable th {
  padding: 6px 0 !important;
}

/deep/ .elTable td {
  padding: 5px 0 !important;
}

/deep/ .el-form-item {
  margin-bottom: 10px;
}

/deep/ .anchorBL {
  display: none;
}

.map-ztxx {
  width: calc(100% - 15px);
  margin-left: 15px;
  line-height: 30px;
}
</style>
