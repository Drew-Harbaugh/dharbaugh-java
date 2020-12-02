<template>
  <div class="card" v-bind:class="{ read: isRead }">
    <!-- Please leave <img> commented out until directed to remove open and close comment tags in the README. -->
    <h2 class="book-title">{{ book.title }}</h2>
    <img
      v-if="book.isbn"
      v-bind:src="
        'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'"/>
    <h3 class="book-author">{{ book.author }}</h3>
    
        <button @click="changeBookStatus()" :class="isRead?'mark-unread': 'mark-read'">Mark {{isRead?"Unread" : "Read"}}</button>
        
  
  
  </div>
</template>

<script>
export default {
  name: "book-card",
  props: {
    book: Object,
      type: Boolean,
      required: true,
    },
    data() {
        return {eachBook: this.book}
    },
    computed: {
        isRead() {
            return this.eachBook.read
        }
    },
    methods: {
        changeStatus(){
            this.eachBook.read=!this.eachBook.read,
            this.$store.commit('SET_READ_STATUS', this.eachBook)
        }
    }
  };
</script>

<style>
.card {
  border: 2px solid black;
  border-radius: 10px;
  width: 250px;
  height: 550px;
  margin: 20px;
}

.card.read {
  background-color: lightgray;
}

.card .book-title {
  font-size: 1.5rem;
}

.card .book-author {
  font-size: 1rem;
}

</style>