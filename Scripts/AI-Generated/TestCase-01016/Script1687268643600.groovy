import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_still-getting-unable-to-determine-the-current-character-it-is-not-a-string-number-array-or-object'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/still-getting-unable-to-determine-the-current-character-it-is-not-a-string-number-array-or-object/55364')

'step 2: Add visual checkpoint at Page_t_still-getting-unable-to-determine-the-current-character-it-is-not-a-string-number-array-or-object'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01016_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
