<template>
<div>
  <reading-list></reading-list>
  <nav>
    <ul>
        <li class="addBook"><a href="/addBook">Add Book to Reading List</a></li>
        
    </ul>
</nav>
  </div>
</template>

<script>
import ReadingList from '@/components/ReadingList.vue'
export default {
  components: { 
      ReadingList 
      },

}
</script>

<style>

</style>