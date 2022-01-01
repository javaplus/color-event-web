let red = document.getElementById('red');
let green = document.getElementById('green');
let blue = document.getElementById('blue');
let box = document.querySelector('div.neumorphism-3');


let r = 204, g = 0, b = 255;
box.style.backgroundColor = `rgb(${r}, ${g}, ${b})`;

red.addEventListener("keyup", function (event) {
	r = red.value;
	if (!r)
		r = 0;
	box.style.backgroundColor = `rgb(${r}, ${g}, ${b})`;
});

green.addEventListener("keyup", function (event) {
	g = green.value;
	if (!g)
		g = 0;
	box.style.backgroundColor = `rgb(${r}, ${g}, ${b})`;
});

blue.addEventListener("keyup", function (event) {
	b = blue.value;
	if (!b)
		b = 0;
	box.style.backgroundColor = `rgb(${r}, ${g}, ${b})`;
});

blue.addEventListener("focusout", function (event) {
    b = blue.value;
	if (!b)
		b = 0;
    if(b > 255)
        b = 255;
     if(b < 0)
        b = 0;
	box.style.backgroundColor = `rgb(${r}, ${g}, ${b})`;
    blue.value = b;
});

green.addEventListener("focusout", function (event) {
    g = green.value;
	if (!g)
		g = 0;
    if(g > 255)
        g = 255;
     if(g < 0)
        g = 0;
	box.style.backgroundColor = `rgb(${r}, ${g}, ${b})`;
    green.value = g;
});

red.addEventListener("focusout", function (event) {
    r = red.value;
	if (!r)
		r = 0;
    if(r > 255)
        r = 255;
     if(r < 0)
        r = 0;
	box.style.backgroundColor = `rgb(${r}, ${g}, ${b})`;
    red.value = r;
});
