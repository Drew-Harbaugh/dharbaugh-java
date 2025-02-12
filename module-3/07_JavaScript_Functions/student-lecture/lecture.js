/**
 * All named functions will have the function keyword and
 * a name followed by parentheses.
 * 
 * @returns {number} 1
 */
function returnOne() {
  return 1;
}

/**
 * Functions can also take parameters. These are just variables that are filled
 * in by whoever is calling the function.
 *
 * Also, we don't *have* to return anything from the actual function.
 *
 * @param {any} value the value to print to the console
 */
function printToConsole(value) {
  console.log(value);
}

/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */
function multiplyTogether(firstParameter, secondParameter) {
  return firstParameter * secondParameter;
}

/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=0] the second parameter to multiply
 */
function multiplyNoUndefined(firstParameter =0, secondParameter =0) {
  let result = firstParameter * secondParameter;
  if (Number.isNaN(result)) {
    throw 'That makes no sense.';
  } else {
    return result;
  }
}


 
/**
 * Functions can return earlier before the end of the function. This could be useful
 * in circumstances where you may not need to perform additional instructions or have to
 * handle a particular situation.
 * In this example, if the firstParameter is equal to 0, we return secondParameter times 2.
 * Observe what's printed to the console in both situations.
 * 
 * @param {number} firstParameter the first parameter
 * @param {number} secondParameter the second parameter
 */
function returnBeforeEnd(firstParameter, secondParameter) {
  console.log("This will always fire.");

  if (firstParameter === 0) {
    console.log("Returning secondParameter times two.");
    return secondParameter * 2;
  }

  //this only runs if firstParameter is NOT 0
  console.log("Returning firstParameter + secondParameter.");
  return firstParameter + secondParameter;
}

/**
 * Scope is defined as where a variable is available to be used.
 *
 * If a variable is declare inside of a block, it will only exist in
 * that block and any block underneath it. Once the block that the
 * variable was defined in ends, the variable disappears.
 */
function scopeTest() {
  // This variable will always be in scope in this function
  let inScopeInScopeTest = true;

  {
    // this variable lives inside this block and doesn't
    // exist outside of the block
    let scopedToBlock = inScopeInScopeTest;
  }

  // scopedToBlock doesn't exist here so an error will be thrown
  if (inScopeInScopeTest && scopedToBlock) {
    console.log("This won't print!");
  }
}

/**
 * 
 * @param {string} name - the person's full name
 * @param {number} age - the person's age in years
 * @param {string[]} listOfQuirks - list of quirky characteristics
 * @param {string} separator - used to join all information in output
 * @returns{string} - the sentence created from the given info
 */
function createSentenceFromUser(name, age, listOfQuirks = [], separator = ', ') {
  let description = `${name} is currently ${age} years old. Their quirks are: `;
  return description + listOfQuirks.join(separator);
}

/**
 * @param {number} n 
 */
function logTimesTwo(n) {
  console.log(n * 2)
}

function imperativeForEach() {
  const myArray = [3, 2, 9, 6, 7, 9, 5];

  for (let num of myArray) {
    logTimesTwo(num);
  }
}

function declarativeForEach() {
  const myArray = [3, 2, 9, 6, 7, 9, 5];
  
  myArray.forEach(logTimesTwo);
  
  myArray.forEach(function(n) {console.log(n * 2);});
  myArray.forEach((n) => {console.log(n * 2);});
  myArray.forEach(n => console.log(n * 2)); 
}

function isEven(num) {
  return num % 2 === 0;
}

function filterDemo() {
  const myArray = [3, 2, 9, 6, 7, 9, 5];

  // return myArray.filter(isEven)
  // return myArray.filter(num => {return num % 2 === 0;});
  return myArray.filter(num => num % 2 === 0);
}

function mapDemo() {
  const myArray = ['red', 'blue', 'green'];

  return myArray.map(str => str.substring(1));
}

function mapWithNumbers() {
  const myArray = [3, 2, 9, 6, 7, 9, 5];

  return myArray.map(n => n + 1);
}

function mapWithObjects() {
  const customers = [
    {name: 'Fred', amountSpent: 1000},
    {name: 'Mary', amountSpent: 500},
    {name: 'Sally', amountSpent: 2500}
  ];

  // return customers.map(c => c.name);
  return customers.filter(c => c.amountSpent >= 1000).map(c => c.name);
}

function reduceDemo() {
  const myArray = [3, 2, 9, 6, 7, 9, 5];

  return myArray.reduce((total, num) => total + num);
}

function reduceWithObjects() {
  const customers = [
    {name: 'Fred', amountSpent: 1000},
    {name: 'Mary', amountSpent: 500},
    {name: 'Sally', amountSpent: 2500}
  ];

  return customers.reduce((total, customer) => total + customer.amountSpent, 0);
}


/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers(numbersToSum) {
  return numbersToSum.reduce((sum, nums) => sum + nums);
}

/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 *   multiples of 3
 */
function allDivisibleByThree(numbersToFilter) {
  return numbersToFilter.filter(n => n % 3 === 0);
}
