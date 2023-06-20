import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_taking-entire-page-screenshots-to-measure-the-image-diff-using-ashot'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/taking-entire-page-screenshots-to-measure-the-image-diff-using-ashot/12429')

'step 2: Add visual checkpoint at Page_t_taking-entire-page-screenshots-to-measure-the-image-diff-using-ashot'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00976_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
