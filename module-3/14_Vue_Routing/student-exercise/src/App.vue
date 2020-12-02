<template>
  <div id="app">
    <nav>
    <ul>
        <li class="home"><a href="/">Home</a></li> | <li class="myBooks"><a href="/myBooks">My Books</a></li>
        
    </ul>
</nav>
    <router-view />
  </div>
</template>

<script>

export default {
  name: 'app'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin: 60px;
}

ul li{
  display: inline;
}
</style>
