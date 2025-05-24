const express = require('express');
const app = express();
app.get('/home',(req,res)=>{
    res.send('home page');
});
app.get('/about',(req,res)=>{
    res.send('about page ');
});
app.get('/contact',(req,res)=>{
    res.send('my contact');
});
app.get('/name',(req,res)=>{
    res.send('vanita');
});
app.listen(3000,()=>{
    console.log('server start!!');
});