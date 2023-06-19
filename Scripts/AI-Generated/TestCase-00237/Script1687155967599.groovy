import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-can-i-open-chrome-with-disable-web-security-user-data-dir-c-my-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-can-i-open-chrome-with-disable-web-security-user-data-dir-c-my-data/6732/6')

'step 2: Add visual checkpoint at Page_t_how-can-i-open-chrome-with-disable-web-security-user-data-dir-c-my-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00237_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
