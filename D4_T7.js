// var fs=require("fs");
// var data=fs.readFileSync("Data.txt","utf-8");
// console.log(data)
// var words=data.split(" ");
// console.log(words);
// for(let i=0;i<words.length;i++){
//     var set_words= new Set(words[i]);
//     console.log(set_words);
//     for(let j=0;j<set_words.size;j++){
//         console.log(j)
//         console.log(set_words.findIndex(j))
//         for(let k=0;k<words[i].length;k++){
//             if(set_words[j]==words[k]){
                
//             }
//         }   
//     }
// }
// var fs = require("fs");
// var data = fs.readFileSync("Data.txt", "utf-8");
// console.log(data);
// var words = data.split(" ");
// console.log(words);
// for (let i = 0; i < words.length; i++) {
//   var set_words = new Set(words[i]);
//   console.log(set_words);
//   var setarray = Array.from(set_words);
//   for (let j=0;j<setarray.length;j++) {
//     console.log(j); // Index
//     console.log(setarray[j]);
//     for (let k = 0; k < words[i].length; k++) {
//       if (setarray[j] === words[i][k]) {
//         console.log(`Match found: ${setarray[j]} == ${words[i][k]}`);
//         console.log(`Word ${i + 1} (${words[i][k]}) ➞`);
//       }
//     }
//   }
// }
var fs = require("fs");
var data = fs.readFileSync("Data.txt", "utf-8");
var words = data.split(" ");
console.log("Words from file:", words);
function findRecurringCharacters(word, i = 0, seen = new Map(), result = {}) {
  if (i >= word.length) return result;
  var char = word[i];
  if (seen.has(char)) {
    if (!result[char]) {
      result[char] = [seen.get(char), i];
    }
  } else {
    seen.set(char, i); 
  }
  return findRecurringCharacters(word, i + 1, seen, result);
}

words.forEach((word, i) => {
  const result = findRecurringCharacters(word);
  if (Object.keys(result).length > 0) {
    console.log(`Word ${i + 1} (${word}) ➞`, result);
  } else {
    console.log(`Word ${i + 1} (${word}) ➞ No recurring characters found`);
  }
});
