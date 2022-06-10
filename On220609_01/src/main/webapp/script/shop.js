function memberCheck() {
	if(document.frm.custno.value.length == 0) {
  	alert("회원번호를 입력해주세요.");
    frm.custno.focus();
    return false;
  }
	if(document.frm.custname.value.length == 0) {
  	alert("이름을 입력해주세요.");
    frm.custname.focus();
    return false;
  }
  if(document.frm.phone.value.length == 0) {
  	alert("전화번호를 입력해주세요.");
    frm.phone.focus();
    return false;
  }
  if(document.frm.address.value.length == 0) {
  	alert("주소를 입력해주세요.");
    frm.address.focus();
    return false;
  }
  if(document.frm.joindate.value.length == 0) {
  	alert("가입일자를 입력해주세요.");
    frm.joindate.focus();
    return false;
  }
  if(document.frm.grade.value.length == 0) {
  	alert("고객등급을 입력해주세요.");
    frm.grade.focus();
    return false;
  }
  if(document.frm.city.value.length == 0) {
  	alert("거주도시 코드를 입력해주세요.");
    frm.city.focus();
    return false;
  }
  return true;
}