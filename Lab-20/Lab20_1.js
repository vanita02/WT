const express = require('express');

const app = express();

const demo = (req,res,next)=>{
    console.log('msg');
    next();
}

app.use(demo);

app.get('/',(req,res)=>{
    res.send('hello world');
})

app.listen(3000,(req,res)=>{
    console.log('server started at 3000!!');
})