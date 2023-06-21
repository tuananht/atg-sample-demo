import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_u_grylion54_activity_replies'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/u/grylion54/activity/replies')

'step 2: Add visual checkpoint at Page_u_grylion54_activity_replies'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00252_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
