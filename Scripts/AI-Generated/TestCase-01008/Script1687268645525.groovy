import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-extract-and-write-data-in-a-test-case'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-extract-and-write-data-in-a-test-case/61005')

'step 2: Add visual checkpoint at Page_t_how-to-extract-and-write-data-in-a-test-case'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01008_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
