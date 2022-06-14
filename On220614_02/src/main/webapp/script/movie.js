function movieCheck() {
	if(document.frm.title.value.length == 0) {
  	alert("제목 정보를 입력해주세요.");
    frm.title.focus();
    return false;
  }
	if(document.frm.price.value.length == 0) {
  	alert("가격 정보를 입력해주세요.");
    frm.price.focus();
    return false;
  }
	if(document.frm.director.value.length == 0) {
  	alert("감독 정보를 입력해주세요.");
    frm.director.focus();
    return false;
  }
	if(document.frm.actor.value.length == 0) {
  	alert("배우 정보를 입력해주세요.");
    frm.actor.focus();
    return false;
  }
	if(document.frm.synopsis.value.length == 0) {
  	alert("설명을 입력해주세요.");
    frm.synopsis.focus();
    return false;
  }
  return true;
}