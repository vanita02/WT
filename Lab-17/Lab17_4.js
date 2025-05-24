const child_process = require('child_process');
// child_process.exec('dir',(err,stdout,stdin)=>{
//     console.log(stdout);
// });

child_process.exec('Demo.java',(err,stdout,stdin)=>{
    console.log(stdout);
});