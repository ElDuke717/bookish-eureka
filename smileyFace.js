// You need to install the 'canvas' package first using npm or yarn
// npm install canvas
const { createCanvas } = require('canvas');
const canvas = createCanvas(200, 200);
const ctx = canvas.getContext('2d');

// Draw the face
// ... (same drawing logic as in the browser example)
const canvas = document.getElementById('smileyCanvas');
    const ctx = canvas.getContext('2d');

    // Draw the face
    ctx.beginPath();
    ctx.arc(100, 100, 50, 0, Math.PI * 2, true); // Outer circle
    ctx.fillStyle = 'yellow';
    ctx.fill();
    ctx.lineWidth = 2;
    ctx.stroke();

    // Draw the eyes
    ctx.fillStyle = 'black';
    ctx.beginPath();
    ctx.arc(80, 85, 5, 0, Math.PI * 2, true);  // Left eye
    ctx.arc(120, 85, 5, 0, Math.PI * 2, true);  // Right eye
    ctx.fill();

    // Draw the mouth
    ctx.beginPath();
    ctx.arc(100, 100, 35, 0, Math.PI, false);  // Mouth (clockwise)
    ctx.stroke();

// To display this, you'd need to save it to a file or stream it to a web server
const fs = require('fs');
const out = fs.createWriteStream(__dirname + '/smiley.png');
const stream = canvas.createPNGStream();
stream.pipe(out);
out.on('finish', () => console.log('The PNG file was created.'));
