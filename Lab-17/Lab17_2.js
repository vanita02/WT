const path = require('path');
ans1 = path.normalize('./abc/xyz/../orj/..');
console.log(ans1);

ans2 = path.resolve('abc','xyz');
console.log(ans2);

ans3 = path.relative('/df/hg','/nv/hv');
console.log(ans3);

ans4 = path.dirname('/xtz/cfr.txt');
console.log(ans4);

ans5 = path.basename('/xtz/cfr.txt');
console.log(ans5);

ans6 = path.extname('/xtz/cfr.txt');
console.log(ans6);