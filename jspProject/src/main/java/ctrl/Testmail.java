package ctrl;

public class Testmail {
	public static void main(String[] args) {
		GmailSend gs=new GmailSend();
		gs.GmailSet("sonpill5000@naver.com", "test", "<%@ page language=\"java\" contentType=\"text/html; charset=UTF-8\"\r\n"
				+ "	pageEncoding=\"UTF-8\"%>\r\n"
				+ "<%@ taglib prefix=\"c\" uri=\"http://java.sun.com/jsp/jstl/core\"%>\r\n"
				+ "<%@ taglib prefix=\"ryo\" tagdir=\"/WEB-INF/tags\"%>\r\n"
				+ "<!-- /*\r\n"
				+ "* Template Name: Style\r\n"
				+ "* Template Author: Untree.co\r\n"
				+ "* Tempalte URI: https://untree.co/\r\n"
				+ "* License: https://creativecommons.org/licenses/by/3.0/\r\n"
				+ "*/ -->\r\n"
				+ "<!doctype html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"utf-8\">\r\n"
				+ "<meta name=\"viewport\"\r\n"
				+ "	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n"
				+ "<meta name=\"author\" content=\"Untree.co\">\r\n"
				+ "<link rel=\"shortcut icon\" href=\"favicon.png\">\r\n"
				+ "\r\n"
				+ "<meta name=\"description\" content=\"\" />\r\n"
				+ "<meta name=\"keywords\" content=\"free template, bootstrap, bootstrap4\" />\r\n"
				+ "<link\r\n"
				+ "	href=\"https://fonts.googleapis.com/css2?family=Do+Hyeon&family=Single+Day&display=swap\"\r\n"
				+ "	rel=\"stylesheet\">\r\n"
				+ "<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n"
				+ "<link\r\n"
				+ "	href=\"https://fonts.googleapis.com/css2?family=Crimson+Text:ital@0;1&family=Playfair+Display:ital,wght@0,400;0,700;1,400;1,700&display=swap\"\r\n"
				+ "	rel=\"stylesheet\">\r\n"
				+ "\r\n"
				+ "<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n"
				+ "<link rel=\"stylesheet\" href=\"css/animate.min.css\">\r\n"
				+ "<link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\r\n"
				+ "<link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\r\n"
				+ "<link rel=\"stylesheet\" href=\"fonts/icomoon/style.css\">\r\n"
				+ "<link rel=\"stylesheet\" href=\"fonts/feather/style.css\">\r\n"
				+ "<link rel=\"stylesheet\" href=\"fonts/flaticon/font/flaticon.css\">\r\n"
				+ "<link rel=\"stylesheet\" href=\"css/jquery.fancybox.min.css\">\r\n"
				+ "<link rel=\"stylesheet\" href=\"css/aos.css\">\r\n"
				+ "<link rel=\"stylesheet\" href=\"css/style.css\">\r\n"
				+ "\r\n"
				+ "<title>펫키지</title>\r\n"
				+ "<script src=\"https://code.jquery.com/jquery-3.6.0.js\"\r\n"
				+ "	integrity=\"sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=\"\r\n"
				+ "	crossorigin=\"anonymous\"></script>\r\n"
				+ "<!-- memberchange만의 특수 style설정 -->\r\n"
				+ "<style type=\"text/css\">\r\n"
				+ ".modal {\r\n"
				+ "	position: fixed;\r\n"
				+ "	top: 50%;\r\n"
				+ "	left: 50%;\r\n"
				+ "	width: 100%;\r\n"
				+ "	height: 100%;\r\n"
				+ "	display: none;\r\n"
				+ "	background-color: rgba(0, 0, 0, 0.4);\r\n"
				+ "	transform: translate(-50%, -50%);\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".modal.show {\r\n"
				+ "	display: block;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".modal_body {\r\n"
				+ "	position: absolute;\r\n"
				+ "	top: 50%;\r\n"
				+ "	left: 50%;\r\n"
				+ "	width: 100%;\r\n"
				+ "	height: 100vh;\r\n"
				+ "	padding: 40px;\r\n"
				+ "	text-align: center;\r\n"
				+ "	background-color: rgb(255, 255, 255);\r\n"
				+ "	border-radius: 10px;\r\n"
				+ "	box-shadow: 0 2px 3px 0 rgba(34, 36, 38, 0.15);\r\n"
				+ "	transform: translateX(-50%) translateY(-50%);\r\n"
				+ "}\r\n"
				+ "</style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "	<ryo:header />\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "	<ryo:menu type=\"receipt\" />\r\n"
				+ "\r\n"
				+ "	<div class=\"container pt-3 pb-3 mb-3 border-bottom\">\r\n"
				+ "		<div class=\"row justify-content-center\">\r\n"
				+ "			<form>\r\n"
				+ "				<table border=\"2\"\r\n"
				+ "					style=\"width: 450px; height: 500px; border-color: black;\">\r\n"
				+ "					<tr style=\"background-color: white;\">\r\n"
				+ "						<td colspan=\"2\" align=\"center\"><h5 style=\"padding-left: 10px;\">영수증</h5></td>\r\n"
				+ "					</tr>\r\n"
				+ "					<tr>\r\n"
				+ "						<td align=\"center\" >\r\n"
				+ "							<h5 style=\"text-align: center\">제품 이름</h5>\r\n"
				+ "						</td>\r\n"
				+ "						<td>\r\n"
				+ "							<h5 style=\"text-align: center;\">제품 가격</h5>\r\n"
				+ "						</td>\r\n"
				+ "					</tr>\r\n"
				+ "					<!-- 여백 -->\r\n"
				+ "					<tr>\r\n"
				+ "						<td colspan=\"2\"></td>\r\n"
				+ "					</tr>\r\n"
				+ "					<c:forEach var=\"i\" items=${dataI}>\r\n"
				+ "					<tr>\r\n"
				+ "						<td align=\"center\">\r\n"
				+ "							<h5 style=\"text-align: center\">${i.iname}</h5>\r\n"
				+ "						</td>\r\n"
				+ "						<td style=\"text-align:right;\">\r\n"
				+ "							<h5 style=\"text-align: right; padding-right: 10px;\">\r\n"
				+ "								${i.iprice}원</h5>\r\n"
				+ "						</td>\r\n"
				+ "					</tr>\r\n"
				+ "					</c:forEach>\r\n"
				+ "					<!-- 여백 -->\r\n"
				+ "					<tr>\r\n"
				+ "						<td colspan=\"2\"></td>\r\n"
				+ "					</tr>\r\n"
				+ "					<!-- 여백 -->\r\n"
				+ "					<!-- 펫 리스트 반복 -->\r\n"
				+ "					<tr>\r\n"
				+ "						<td>\r\n"
				+ "							<h5 style=\"text-align: center; padding-left: 10px;\">총 합계</h5>\r\n"
				+ "						</td>\r\n"
				+ "						<td>\r\n"
				+ "							<h5 style=\"text-align: right; padding-right: 10px;\">price</h5>\r\n"
				+ "						</td>\r\n"
				+ "					</tr>\r\n"
				+ "				</table>\r\n"
				+ "			</form>\r\n"
				+ "			<!-- <div>\r\n"
				+ "			<a><input type=\"button\" class=\"btn btn-outline-black btn-block\" value=\"메인으로 가기\"></a>\r\n"
				+ "			</div> -->\r\n"
				+ "\r\n"
				+ "		</div>\r\n"
				+ "	</div>\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "	<ryo:footer />\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "");
	}
}
