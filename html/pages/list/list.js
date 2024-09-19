// pages/list/list.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    query:{},

    gridList:[
      {
        id:1,name:"进口原装",icon:"//m.360buyimg.com/babel/jfs/t1/172295/40/1180/29035/60632136E2a14d458/9504e5cee7f380e8.png"
      },
      {
        id:2,name:"学习用书",icon:"//m.360buyimg.com/babel/jfs/t1/158752/33/16269/20778/60631f83E2adb7e0c/1144b6ba0623e316.png"
      },
      {
        id:3,name:"IT科技",icon:"//m.360buyimg.com/babel/jfs/t1/167490/37/15586/23009/6063211fE341a059e/597cc7e97c639732.png"
      },
      {
        id:4,name:"少儿图书",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"
      },
      {
        id:5,name:"少儿图书",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"
      },
      {
        id:6,name:"少儿图书",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"
      },
      {
        id:7,name:"少儿图书",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"
      },
      {
        id:8,name:"少儿图书",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"
      },
      {
        id:8,name:"少儿图书",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"
      },
      {
        id:8,name:"少儿图书",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"
      },
      {
        id:8,name:"少儿图书",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"
      },

    ]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad(options) {
    
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady:function(){
    wx.setNavigationBarTitle({
      title: '购物车',
    })
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage() {

  }
})