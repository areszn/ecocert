/* scripts/login.js 编码为 utf-8  */


$(function(){
	
	$('#login').click(searchAction);
	
//	//注册功能
//	$('#regist_button').click(registAction);
//	$('#regist_username').blur(checkRegistName);
//	$('#regist_password').blur(checkRegistPassword);
//	$('#final_password').blur(checkConfirm);
});
//






/**
 * 
 */
function registAction(){
	console.log('registAction');
	//检验界面参数
	var n = checkRegistName() +
		checkRegistPassword() +
		checkConfirm();
	if(n!=3){
		return ;
	}
	//获取界面中表单数据
	var name = $('#regist_username').val().trim();
	var realname = $('#realname').val();
	var password = $('#regist_password').val();
	var confirm = $('#final_password').val();
	//发起AJAX请求
	var url = 'user/regist.do';
	var data = {name:name, 
			realname:realname, 
			password:password, 
			confirm:confirm};
	//console.log(data);
	// $.post 是 $.ajax的简化版
	$.post(url, data, function(result){
		console.log(result);
		if(result.state==0){
			//退回登录界面
			$('#back').click();
			var name = result.data.name;
			$('#count').val(name);
			$('#password').focus();
			//清空表单
			$('#regist_username').val('');
			$('#realname').val('');
			$('#regist_password').val('');
			$('#final_password').val('');
			 
		}else if(result.state==4){
			$('#regist_username').next().show()
			  .find('span').html(result.message);
		}else if(result.state==3){
			$('#regist_password').next().show()
			  .find('span').html(result.message);
		}else{
			alert(result.message);
		}
	});
}

function checkName(){
	var name = $('#count').val();
	var rule = /^\w{4,10}$/;
	if(! rule.test(name)){
		$('#count').next().html('4~10个字符');
		return false;
	}
	$('#count').next().empty();
	return true;
}

function checkPassword(){
	var password = $('#password').val();
	var rule = /^\w{4,10}$/;
	if(! rule.test(password)){
		$('#password').next().html('4~10个字符');
		return false;
	}
	$('#password').next().empty();
	return true;
}


function searchAction(){
	
	//获取用户输入的用户名和密码
	var post = $('#post').val();
	var specialtyCode = $('#specialtyCode').val();
	
	//检查 用户名和密码输入框
	console.log(post+"_"+specialtyCode);
	
	//data 对象中的属性名要与服务器控制器的参数
	// 名一致! login(name, password)
//	var data = {"name":name, 
//				"password":password};
//	$.ajax({
//		url:'user/login.do',
//		data:data,
//		type:'post',
//		dataType:'json',
//		success: function(result){
//			
//			if(result.state==0){
//				//登录成功!
//				var user = result.data;
//				console.log(user);
//				//登录成功以后将userId保存到cookie中
//				addCookie("userId", user.id);
//				//跳转到 edit.html
//				location.href='blank.jsp';
//			}else{
//				var msg = result.message;
//				if(result.state==2){
//					$('#count').next().html(msg);
//				}else if(result.state==3){       
//					$('#password').next().html(msg);
//				}else{
//					alert(msg);
//				}
//			}
//		},
//		error: function(e){
//			alert("通信失败!");
//		}
//	});
}








