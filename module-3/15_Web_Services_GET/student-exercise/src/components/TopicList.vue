<template>
  <div class="topic-list">
    <div v-for="topic in topics" v-bind:key="topic.id" class="topic">
      
      <router-link v-bind:to="{ name: 'Messages', params: { id: topic.id }}">
      {{ topic.title }}
      <router-link>
    
    </div>
  </div>
</template>

<script>
export default {
  name: 'topic-list',
  props: ['topics']
}
</script>

<style>
.topic-list {
  padding: 20px 20px;
  margin: 0 auto;
  max-width: 600px;
}
.topic {
  font-size: 24px;
  border-bottom: 1px solid #f2f2f2;
  padding: 10px 20px;
}
.topic:last-child {
  border: 0px;
}
</style>