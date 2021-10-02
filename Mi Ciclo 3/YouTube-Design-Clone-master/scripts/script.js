
function openNav() {
    if(document.getElementById("barraLateralIquierdaID").style.width == "250px"){
        document.getElementById("barraLateralIquierdaID").style.width = "0px";
    }
    else {
        document.getElementById("barraLateralIquierdaID").style.width = "250px";
    }
        
}

function closeNav() {
    document.getElementById("barraLateralIquierdaID").style.width = "0";
}
