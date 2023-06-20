import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-develop-custom-keywords-plugins'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-develop-custom-keywords-plugins/20321')

'step 2: Add visual checkpoint at Page_t_how-to-develop-custom-keywords-plugins'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00281_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
