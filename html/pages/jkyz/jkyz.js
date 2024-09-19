// pages/jkyz/jkyz.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    query:{
    },
    List1:[
      {id:1,title:"book1",body:"bod1",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"},
      {id:2,title:"book2",body:"bod2",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"},
      {id:3,title:"book3",body:"bod3",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"},
      {id:4,title:"book4",body:"bod4",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"},
      {id:5,title:"book4",body:"bod4",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"},
      {id:6,title:"book4",body:"bod4",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"},
      {id:7,title:"book4",body:"bod4",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"},
      {id:8,title:"book4",body:"bod4",icon:"//m.360buyimg.com/babel/jfs/t1/168718/35/15576/26040/60631f2bE964d6c95/fa34b5064c11a1dc.png"}
    ]
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad(options) {
    console.log(options)
    this.setData({
      query:options
    })
  },
  gotoBack(){
    wx.navigateBack()
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady:function(){
    wx.setNavigationBarTitle({
      title: this.data.query.title,
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
    console.log('下拉了一次刷新')
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom() {
    console.log('上拉了一次')
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage() {

  }
})