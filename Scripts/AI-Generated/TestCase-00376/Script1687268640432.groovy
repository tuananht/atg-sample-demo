import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_review'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/review/13737')

'step 2: Add visual checkpoint at Page_review'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00376_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
