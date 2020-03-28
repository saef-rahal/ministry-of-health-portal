
/* DISABLING THE BUTTON ON SHORT INPUTS */
function bttonDisableLogic() {
    const password = document.getElementById("password").value;
    const button = document.getElementById("submitButton");
    const userName = document.getElementById("username").value;

    if (password.length >= 4 && userName.length > 0) button.disabled = false;
    else {
        button.disabled = true;
    }
}



/* HANDLING THE FORM SUBMISSION */
function handleSubmit() {
    const password = document.getElementById("password").value;
    const hiddenPassword = document.getElementById("hiddenPassword");
    const username = document.getElementById("username").value;
    return true;
}