const express = require('express');
const fs = require('fs');
const app = express();
app.get('/home',(req,res)=>{
    fs.readFile('home.txt',(err,data)=>{
        if(err){
            throw err;
        }
        res.write(data);
        return res.send();
    });
});
app.listen(5000,()=>{
    console.log('server start!!');
});