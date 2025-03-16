// index.js
Page({
  data:{
    imgSrc0:"//m.360buyimg.com/babel/jfs/t20270623/243815/23/12774/59385/66783572F8dcfacf0/8046729c1b5bc685.jpg",
    imgSrc1:"//m.360buyimg.com/babel/jfs/t20270621/239149/30/12142/196535/66751ab5F16ce6a3d/a5c26923653e5bac.png",
    imgSrc2:"//m.360buyimg.com/babel/jfs/t20270621/225207/29/20833/75792/66754151Fb50b8e06/86bb544c14c106b3.jpg",
    imgSrc3:"//m.360buyimg.com/babel/jfs/t20270618/211555/5/34421/117457/66715115F392d2d5a/84d8c96b2648179e.png",
    imgSrc4:"//m.360buyimg.com/babel/jfs/t20270531/198872/14/42154/55233/6659ba3dF4bb3e96e/365ed690bdc0acc0.jpg",

    
    
  },
  gotoInfo(){
    wx.navigateTo({
      url:'/pages/jkyz/jkyz?name=zs&age=20'
    })
  },
 onReady:function(){
   wx.setNavigationBarTitle({
     title: '三味书屋',
   })
 }
  



})
