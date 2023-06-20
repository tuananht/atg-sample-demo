import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_authenticate-method-doesn-t-detect-btnok-in-a-9'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/authenticate-method-doesn-t-detect-btnok-in-a-popup/6109/9')

'step 2: Add visual checkpoint at Page_t_authenticate-method-doesn-t-detect-btnok-in-a-9'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00697_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
