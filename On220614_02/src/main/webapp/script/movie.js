function movieCheck() {
	if(document.frm.title.value.length == 0) {
  	alert("제목을 입력해주세요.");
    frm.title.focus();
    return 0;
  }
	if(document.frm.price.value.length == 0) {
  	alert("가격을 입력해주세요.");
    frm.price.focus();
    return 0;
  }
	if(document.frm.director.value.length == 0) {
  	alert("감독을 입력해주세요.");
    frm.director.focus();
    return 0;
  }
	if(document.frm.actor.value.length == 0) {
  	alert("배우를 입력해주세요.");
    frm.actor.focus();
    return 0;
  }
	if(document.frm.synopsis.value.length == 0) {
  	alert("시놉시스를 입력해주세요.");
    frm.synopsis.focus();
    return 0;
  }
  return 1;
}