<%@ page language="java" contentType="text/html; charset=gb2312"
	pageEncoding="gb2312"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../Css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="../Css/bootstrap-responsive.css" />
<link rel="stylesheet" type="text/css" href="../Css/style.css" />
<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="http://jqueryvalidation.org/files/dist/jquery.validate.min.js"></script>
<script
	src="http://jqueryvalidation.org/files/dist/additional-methods.min.js"></script>

<style type="text/css">
body {
	font-size: 20px;
	padding-bottom: 40px;
	background-color: #e9e7ef;
}

.sidebar-nav {
	padding: 9px 0;
}

@media ( max-width : 980px) {
	/* Enable use of floated navbar text */
	.navbar-text.pull-right {
		float: none;
		padding-left: 5px;
		padding-right: 5px;
	}
}
</style>
</head>

<script type="text/javascript">
	$().ready(function() {

		//��ָ֤����
		$("#myform").validate({
			//����Ĭ�ϵ�״̬Ϊkeyup��Ҳ��������Ϊblur
			event : "keyup", //������֤���¼�
			//�趨����
			rules : {
				//��ӦidΪ'username'��input
				username : {
					//������
					required : true,
					//�������ٵ��ַ���
					rangeLength : [ 4, 16 ]
				},
				mail : {
					required : true,
					//��������һ�������ʼ�
					email : true
				},
				password : {
					required : true,
					//����4���ַ�
					minLength : 4
				},
				confirm_password : {
					required : true,
					minLength : 4,
					// ���ĸ���ͬ��������idΪpassword��input��ͬ
					equalTo : "#password"
				},
				agree : "required"

			},

			//������������Ӧ�Ĵ������
			messages : {
				username : {
					//����û���Ϊ�գ�����ʾ�������Ϣ
					required : '�������û���',
					//����ַ����ĳ��Ȳ����ϣ�����ʾ�������Ϣ
					rangeLength : '�û���������4-16���ַ�֮��'
				},
				password : {
					required : '����������',
					minLength : '����������4���ַ�'
				},
				confirm_password : {
					required : '��ȷ���������',
					equalTo : '�����������벻һ��',
					minLength : '����������4���ַ�'
				},
				agree : '��ͬ�����ǵ�����',
				mail : '��������Ч��E-MAIL�ʻ�'
			}
		});
	});
</script>

<body>
	<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<font color="#777777"><strong>��Ӱ༶��</strong></font>
	<form action="../CAddServlet" method="post" class="definewidth m20"
		id="myform">
		<table style="margin-left: 10px; margin-top: 3px;">
			<tr>
				<td>�γ�����</td>
				<td><input id="username" type="text" name="cname"
					style="width: 200px;" placeholder='������γ���' /></td>
			</tr>
			<tr>
				<td>����ѧ�ڣ�</td>
				<td><input id="username" type="text" name="cterm"
					style="width: 200px;" placeholder='�����뿪��ѧ��' /></td>
			</tr>
		</table>
		<button style="margin-left: 5px;" type="submit"
			class="btn btn-primary" type="button">��&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;��</button>
		&nbsp;&nbsp;
		<button type="button" class="btn btn-success" name="backid"
			id="backid">
			<a href="../ShowAllCourseServlet"> �����б�</a>
		</button>
	</form>

</body>
</html>


