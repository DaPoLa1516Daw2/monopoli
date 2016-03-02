/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var loadNewJ = function() {
    var x = document.getElementById('nJ').value;
    var buffer = '';
    for(var i = 0; i < x; i++){
        buffer += '<div class="col-sm-12">'+
                '<label for="Nombre" class="control-label col-sm-1">Nombre: </label>'+
                '<div class="col-sm-3">'+
                '<input type="text" class="form-control col-sm-1" name="Nombre'+i+'"/>'+
                '</div>'+
                '<img src="images/UserIcon1.png" class="col-sm-1" width="35" height="35" alt="UserIcon1"/>'+
                '<input type="radio" name="UserIcon'+i+'" class="col-sm-1"  value="images/UserIcon1.png"/>'+
                '<img src="images/UserIcon2.png" class="col-sm-1"  width="35" height="35" alt="UserIcon2"/>'+
                '<input type="radio" name="UserIcon'+i+'" class="col-sm-1"  value="images/UserIcon2.png"/>'+
                '<img src="images/UserIcon3.png" class="col-sm-1"  width="35" height="35" alt="UserIcon3"/>'+
                '<input type="radio" name="UserIcon'+i+'" class="col-sm-1"  value="images/UserIcon3.png"/>'+
                '<img src="images/UserIcon4.png" class="col-sm-1"  width="35" height="35" alt="UserIcon4"/>'+
                '<input type="radio" name="UserIcon'+i+'" class="col-sm-1"  value="images/UserIcon4.png"/>'+
                '</div>';
    }
    
    document.getElementById('load').innerHTML = buffer;

};

var init = function(){
    document.getElementById('nJ').addEventListener('change', loadNewJ);
};