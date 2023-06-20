import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_parsing-string-to-integer-library-issue'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/parsing-string-to-integer-library-issue/48938')

'step 2: Add visual checkpoint at Page_t_parsing-string-to-integer-library-issue'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00306_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
