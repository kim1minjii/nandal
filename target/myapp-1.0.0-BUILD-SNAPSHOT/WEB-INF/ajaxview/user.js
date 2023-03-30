$(document).ready(function(){
  $('#btn').click(process);
});

function process(){
  $.ajax({
    type:'POST',
    dataType:'json',
    url:'join.do',
    data:{data:$('#data').val()},
    success:viewMessage
  });
}

function viewMessage(res){
  $('#wrap table').empty();
  $('#wrap table').append(`<tr><th>id</th></tr>`);
  $.each(res, function(index, element){
    $('#wrap table').append(`<tr><td>${element.id}</td></tr>`);
  });
}