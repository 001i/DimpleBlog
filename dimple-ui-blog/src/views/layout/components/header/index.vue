<template>
  <div class="header" :style="cover ? { backgroundImage: 'url(' + cover + ')' } : ''">
    <div class="header__content">
      <slot>
        <div class="header__default-title">
          <h1>{{ title }}</h1>
        </div>
      </slot>
    </div>
  </div>
</template>
<script>
export default {
  name: 'layout-header',
  props: {
    cover: {
      type: String
      // default: ''
    },
    title: {
      type: String,
      default: '标题'
    }
  },
  data() {
    return {}
  }
}
</script>
<style lang="scss">
@import '~@/style/index.scss';

.header {
  position: relative;
  height: 400px;
  background-size: cover;
  background-position: center center;
  &__content {
    position: absolute;
    width: 100%;
    height: 100%;
  }
  &__default-title {
    width: 100%;
    height: 100%;
    font-size: 20px;
    color: #fff;
    @include flex-box-center;
  }
}
.header:before {
  content: '';
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  @include themeify() {
    background: themed('bg-header-mask');
  }
}
</style>
