<template>
  <div class="app-container home">
    <el-row :gutter="20">
      <el-col :span="18">
        <h2>欢迎来到张子测试系统</h2>
        <p>
          这一款后台管理系统就是自己为了学习公司用到的技术开发使用，后续会慢慢的补充一些功能，加油吧张子
        </p>
        <p>
          <el-button
            type="primary"
            size="mini"
            icon="el-icon-search"
            plain
            @click="goTarget('https://www.baidu.com')"
          >百度
          </el-button
          >
        </p>
      </el-col>

      <!--右侧-->
      <el-col :span="6">


      </el-col>

    </el-row>
    <el-divider/>
  </div>
</template>

<script>
export default {
  name: "Index",
  data() {
    return {
      // 版本号
      version: "3.8.2",
    };
  },
  methods: {
    goTarget(href) {
      window.open(href, "_blank");
    },
  },
};
</script>

<style scoped lang="scss">
.home {
  blockquote {
    padding: 10px 20px;
    margin: 0 0 20px;
    font-size: 17.5px;
    border-left: 5px solid #eee;
  }

  hr {
    margin-top: 20px;
    margin-bottom: 20px;
    border: 0;
    border-top: 1px solid #eee;
  }

  .col-item {
    margin-bottom: 20px;
  }

  ul {
    padding: 0;
    margin: 0;
  }

  font-family: "open sans", "Helvetica Neue", Helvetica, Arial, sans-serif;
  font-size: 13px;
  color: #676a6c;
  overflow-x: hidden;

  ul {
    list-style-type: none;
  }

  h4 {
    margin-top: 0px;
  }

  h2 {
    margin-top: 10px;
    font-size: 26px;
    font-weight: 100;
  }

  p {
    margin-top: 10px;

    b {
      font-weight: 700;
    }
  }

  .update-log {
    ol {
      display: block;
      list-style-type: decimal;
      margin-block-start: 1em;
      margin-block-end: 1em;
      margin-inline-start: 0;
      margin-inline-end: 0;
      padding-inline-start: 40px;
    }
  }
}
</style>

