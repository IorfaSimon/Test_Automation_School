const book = {
    title:'the radical cross',
    description:'living the passion of Christ',
    numberOfpages:148,
    author:'tozer',
    isReading:true,
    toggleReadingAndNotReading: function(){
        if(book.isReading===false){
            book.isReading = true
        }else{
            book.isReading = false
        }
    }
    

}
book.toggleReadingAndNotReading()

console.log(book.isReading)