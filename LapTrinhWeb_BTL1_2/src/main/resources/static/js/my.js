function enterEditMode(){
    document.getElementById("edit_button").style.display = "none";
    document.getElementById("save_button").style.display = "block";

    document.getElementById("title").disabled = false;
    document.getElementById("author").disabled = false;
    document.getElementById("releaseDate").disabled = false;
    document.getElementById("category").disabled = false;
    document.getElementById("page").disabled = false;
    document.getElementById("description").disabled = false;
}

/*function exitEditMode(){
    document.getElementById("edit_button").style.display = "block";
    document.getElementById("save_button").style.display = "none";

    document.getElementById("fullName").disabled = true;
    document.getElementById("email").disabled = true;
    document.getElementById("dateOfBirth").disabled = true;

    document.getElementById("informationProfile").submit();
}

if ( window.history.replaceState ) {
    window.history.replaceState( null, null, window.location.href );
}

function showPreview(event){
    if (event.target.files.length > 0 ){
        let src = URL.createObjectURL(event.target.file[0]);
        let image = document.getElementById("image");
        image.src = src;
        // image.style.display = "block";
    }
} */