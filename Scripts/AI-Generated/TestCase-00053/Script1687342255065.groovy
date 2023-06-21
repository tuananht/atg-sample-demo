import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_no-signature-of-method-static-com-kms-katalon-core-webui-keyword-webuibuiltinkeywords-click'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/no-signature-of-method-static-com-kms-katalon-core-webui-keyword-webuibuiltinkeywords-click/36111')

'step 2: Add visual checkpoint at Page_t_no-signature-of-method-static-com-kms-katalon-core-webui-keyword-webuibuiltinkeywords-click'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00053_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
