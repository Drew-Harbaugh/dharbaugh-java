<template>
  <div class="container">
    <table id="tblUsers">
      <thead>
        <tr>
          <th>&nbsp;</th>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Username</th>
          <th>Email Address</th>
          <th>Status</th>
          <th>Actions</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>
            <input v-bind:checked="allChecked" v-on:change="toggleAll()" type="checkbox" id="selectAll" />
          </td>
          <td>
            <input type="text" id="firstNameFilter" v-model="filter.firstName" />
          </td>
          <td>
            <input type="text" id="lastNameFilter" v-model="filter.lastName" />
          </td>
          <td>
            <input type="text" id="usernameFilter" v-model="filter.username" />
          </td>
          <td>
            <input type="text" id="emailFilter" v-model="filter.emailAddress" />
          </td>
          <td>
            <select id="statusFilter" v-model="filter.status">
              <option value>Show All</option>
              <option value="Active">Active</option>
              <option value="Disabled">Disabled</option>
            </select>
          </td>
          <td>&nbsp;</td>
        </tr>
        <tr
          v-for="user in filteredList"
          v-bind:key="user.id"
          v-bind:class="{ disabled: user.status === 'Disabled' }"
        >
          <td>
            <input type="checkbox" v-bind:id="user.id" v-bind:value="user.id" />
          </td>
          <td>{{ user.firstName }}</td>
          <td>{{ user.lastName }}</td>
          <td>{{ user.username }}</td>
          <td>{{ user.emailAddress }}</td>
          <td>{{ user.status }}</td>
          <td>
            <button class="btnEnableDisable" v-on:click.prevent="flipStatus(user.id); enableDisable=false" v-if="user.status === 'Active'">Disable</button>
            <button class="btnEnableDisable" v-on:click.prevent="flipStatus(user.id); enableDisable=true" v-else>Enable</button>
          </td>
        </tr>
      </tbody>
    </table>


    <div class="all-actions">
      <button v-on:click="enableSelectedUsers()" v-bind:disabled="actionButtonDisabled">Enable Users</button>
      <button v-on:click="disableSelectedUsers()" v-bind:disabled="actionButtonDisabled">Disable Users</button>
      <button v-on:click="deleteSelectedUsers()" v-bind:disabled="actionButtonDisabled">Delete Users</button>
    </div>

    <button v-on:click="showForm = !showForm">Add New User</button>

    <form id="frmAddNewUser" v-on:submit.prevent="saveUser()" v-show="showForm">
      <div class="field">
        <label for="firstName">First Name:</label>
        <input type="text" name="firstName" />
      </div>
      <div class="field">
        <label for="lastName">Last Name:</label>
        <input type="text" name="lastName" />
      </div>
      <div class="field">
        <label for="username">Username:</label>
        <input type="text" name="username" />
      </div>
      <div class="field">
        <label for="emailAddress">Email Address:</label>
        <input type="text" name="emailAddress" />
      </div>
      <button type="submit" class="btn save">Save User</button>
    </form>
  </div>
</template>

<script>
export default {
  name: "user-list",
  data() {
    return {
      showForm: false,
      selectedUserIDs: [],
      
    
      filter: {
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: ""
      },
      newUser: {
        id: null,
        firstName: "",
        lastName: "",
        username: "",
        emailAddress: "",
        status: "Active"
      },
      users: [
        {
          id: 1,
          firstName: "John",
          lastName: "Smith",
          username: "jsmith",
          emailAddress: "jsmith@gmail.com",
          status: "Active"
        },
        {
          id: 2,
          firstName: "Anna",
          lastName: "Bell",
          username: "abell",
          emailAddress: "abell@yahoo.com",
          status: "Active"
        },
        {
          id: 3,
          firstName: "George",
          lastName: "Best",
          username: "gbest",
          emailAddress: "gbest@gmail.com",
          status: "Disabled"
        },
        {
          id: 4,
          firstName: "Ben",
          lastName: "Carter",
          username: "bcarter",
          emailAddress: "bcarter@gmail.com",
          status: "Active"
        },
        {
          id: 5,
          firstName: "Katie",
          lastName: "Jackson",
          username: "kjackson",
          emailAddress: "kjackson@yahoo.com",
          status: "Active"
        },
        {
          id: 6,
          firstName: "Mark",
          lastName: "Smith",
          username: "msmith",
          emailAddress: "msmith@foo.com",
          status: "Disabled"
        }
      ]
    };
  },
  methods: {
    
    saveUser() {
      this.users.push(this.newUser);
      this.resetForm();
    },
    resetForm() {
      this.newUser = {};
    },

    addId(id){
      if(!this.selectedUserIDs.includes(id)){
        this.selectedUserIDs.unshift(id);
      } else {
        this.selectedUserIDs = this.selectedUserIDs.filter(e => {
          return e !== id;
        });
      }
    },
    selectAll() {
      this.users.forEach(e => {
        if (!this.selectedUserIDs.includes(e.id)) {
          this.selectedUserIDs.unshift(e.id);
        }
      })
    },
    deselectAll() {
      this.selectedUserIDs = [];
    },
    toggleAll(){
      if(!document.getElementById('selectAll').checked) {
        this.deselectAll();
      } else {
        this.selectAll();
      }
    },
    allChecked(){
      return this.users.length === this.selectedUserIDs.length;
    },


    enableSelectedUsers() {
      this.users.forEach(element => {
        if(this.selectedUserIDs.includes(element.id)){
          element.status = "Active";
        }
      });
      this.selectedUserIDs = [];
    },
    disableSelectedUsers() {
      this.users.forEach(element => {
        if(this.selectedUserIDs.includes(element.id)){
          element.status = "Disabled";
        }
      });
      this.selectedUserIDs = [];
    },
    deleteSelectedUsers() {
      this.users = this.users.filter(e => {
        return !this.selectedUserIDs.includes(e.id)
      })
      this.selectedUserIDs = [];
    },


    flipStatus(id) {
      let user = this.getUserById(id);

      if (user.status === 'Active') {
        user.status = 'Disabled';
      } else if (user.status === 'Disabled') {
        user.status = 'Active';
      }
    },
    getUserById(id) {
      for (let user of this.users) {
        if (user.id === id) {
          return user;
        }
      }
      return null;
    }
  },
  computed: {



     actionButtonDisabled() {
      if(this.selectedUserIDs.length === 0) {
        return true;
      } else {
        return false;
      }
    },

    filteredList() {
      let filteredUsers = this.users;
      if (this.filter.firstName != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.firstName
            .toLowerCase()
            .includes(this.filter.firstName.toLowerCase())
        );
      }
      if (this.filter.lastName != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.lastName
            .toLowerCase()
            .includes(this.filter.lastName.toLowerCase())
        );
      }
      if (this.filter.username != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.username
            .toLowerCase()
            .includes(this.filter.username.toLowerCase())
        );
      }
      if (this.filter.emailAddress != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.emailAddress
            .toLowerCase()
            .includes(this.filter.emailAddress.toLowerCase())
        );
      }
      if (this.filter.status != "") {
        filteredUsers = filteredUsers.filter((user) =>
          user.status === this.filter.status
        );
      }
      return filteredUsers;
    },
   
  }
};



</script>

<style scoped>
table {
  margin-top: 20px;
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen,
    Ubuntu, Cantarell, "Open Sans", "Helvetica Neue", sans-serif;
  margin-bottom: 20px;
}
th {
  text-transform: uppercase;
}
td {
  padding: 10px;
}
tr.disabled {
  color: red;
}
input,
select {
  font-size: 16px;
}

form {
  margin: 20px;
  width: 350px;
}
.field {
  padding: 10px 0px;
}
label {
  width: 140px;
  display: inline-block;
}
button {
  margin-right: 5px;
}
.all-actions {
  margin-bottom: 40px;
}
.btn.save {
  margin: 20px;
  float: right;
}
</style>
