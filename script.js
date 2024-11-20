document.getElementById('purchaseForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the default form submission
    
    // Get form data
    const email = document.getElementById('email').value;
    const quantity = document.getElementById('quantity').value;

    // Simulate a purchase request to the backend (in real life, use AJAX/fetch to communicate with the Java backend)
    console.log('Processing purchase for:', email);
    console.log('Quantity:', quantity);

    // Simulate the output of the Java code
    const confirmationMessage = `
        Processing purchase for: ${email} <br>
        Book: Java Programming <br>
        Quantity: ${quantity} <br>
        Total Price: $${(29.99 * quantity).toFixed(2)}
    `;

    // Display the confirmation message on the page
    document.getElementById('confirmationMessage').innerHTML = confirmationMessage;
    document.getElementById('confirmationMessage').classList.remove('hidden');
});
