import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_openai-just-released-a-chatgpt-app-for-ios'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/openai-just-released-a-chatgpt-app-for-ios/88282')

'step 2: Add visual checkpoint at Page_t_openai-just-released-a-chatgpt-app-for-ios'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00184_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
