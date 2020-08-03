var radioAlert = document.getElementById("radioAlert");
 
var frame = [
    ["오", "전", "다", "일", "세", "네"],
    ["후", "여", "섯", "곱", "열", "한"],
    ["밤", "덟", "아", "홉", "두", "시"],
    ["자", "이", "삼", "사", "오", "십"],
    ["정", "일", "이", "삼", "사", "오"],
    ["오", "육", "칠", "팔", "구", "분"]
];

for(var i = 0 ; i < frame.length; i++) {
    document.write(frame[i] + "<br>");
}