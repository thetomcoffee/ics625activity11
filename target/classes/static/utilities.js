$( document ).ready(function() {
    $.ajax({
    url: 'nav.html',
    dataType: 'html',
    success : function(data) {
        let $newElement = data;
        $('div#put-nav-here').empty();
        $('div#put-nav-here').append($newElement);
    }, 
    error : function(xhr, ajaxOptions, thrownError) {
        console.error('Error: ' + xhr.status + ' ' + xhr.responseText);
    }
    });

    $.ajax({
    url: 'footer.html',
    dataType: 'html',
    success : function(data) {
        let $newElement = data;
        $('div#put-footer-here').empty();
        $('div#put-footer-here').append($newElement);
    }, 
    error : function(xhr, ajaxOptions, thrownError) {
        console.error('Error: ' + xhr.status + ' ' + xhr.responseText);
    }
    });
});