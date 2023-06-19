import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_is-there-a-way-in-katalon-to-wait-for-a-certain-number-of-4'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/is-there-a-way-in-katalon-to-wait-for-a-certain-number-of-seconds/6210/4')

'step 2: Add visual checkpoint at Page_t_is-there-a-way-in-katalon-to-wait-for-a-certain-number-of-4'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00288_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
