import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_sendkeys-not-working-in-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/sendkeys-not-working-in-firefox/50539/6')

'step 2: Add visual checkpoint at Page_t_sendkeys-not-working-in-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00050_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
