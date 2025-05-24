const http = require('http');
const port = 3000;
const server = http.createServer((req,res)=>{
    res.end("hello students !!");
});

server.listen(port,()=>{
    console.log("server is running at port 3000 !!");
});