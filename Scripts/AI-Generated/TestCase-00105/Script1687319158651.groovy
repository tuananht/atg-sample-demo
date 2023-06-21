import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_what-do-you-need-help-withunable-to-navigate-to-authenticated-page-root-cause-java-lang-exception-failed-to-set-user-name-on-authentication-dialog-object-txtusername-is-not-found'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/what-do-you-need-help-withunable-to-navigate-to-authenticated-page-root-cause-java-lang-exception-failed-to-set-user-name-on-authentication-dialog-object-txtusername-is-not-found/8109')

'step 2: Add visual checkpoint at Page_t_what-do-you-need-help-withunable-to-navigate-to-authenticated-page-root-cause-java-lang-exception-failed-to-set-user-name-on-authentication-dialog-object-txtusername-is-not-found'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00105_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
