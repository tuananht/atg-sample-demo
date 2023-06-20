import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_u_antoine_bulteau_activity_replies'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/u/antoine_bulteau/activity/replies')

'step 2: Add visual checkpoint at Page_u_antoine_bulteau_activity_replies'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01210_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
