<template>
  <div class="messages">
    <topic-details v-bind:topic="activeTopic" />
  </div>
</template>

<script>
import TopicDetails from '@/components/TopicDetails.vue';
import services from '@/services/services.js';

export default {
  name: 'Messages',
  components: {
    TopicDetails
  },
  data() {
    return {
      activeTopic: {
        id: 0,
        title: '',
        messages: []
      },
    }
  },
  created() {
    services.getTopic(this.$route.params.id).then(response => {
      this.activeTopic = response.data;
    });    
    }
  }

</script>
