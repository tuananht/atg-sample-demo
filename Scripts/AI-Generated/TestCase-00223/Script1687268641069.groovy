import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-can-i-convert-a-web-element-into-test-object'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-can-i-convert-a-web-element-into-test-object/8336')

'step 2: Add visual checkpoint at Page_t_how-can-i-convert-a-web-element-into-test-object'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00223_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
