<template>
  <div class="home">
    <h1>Topic Message Board</h1>
    <topic-list v-bind:topics="allTopics"/>
  </div>
</template>

<script>
import TopicList from '@/components/TopicList.vue';
import services from '@/services/services.js'

export default {
  name: 'Home',
  components: {
    TopicList
  },
  data() {
    return {
      allTopics: []
    }
  },
  created() {
    services.getTopicList().then((response => {
      this.allTopics = response.data;
    }));
  }
}
</script>
